const formulario = document.getElementById('formulario');
const nome = document.getElementById('nome');
const id = document.getElementById('id');
const listaUsuario = document.getElementById('listaUsuario');



// Event listener para o formulário
formulario.addEventListener('submit', event => {
    event.preventDefault();
    const id = id.value;
    const nome = nome.value;
    const method = id ? 'PUT' : 'POST';
    const url = id ? `/usuarios/${id}` : '/usuarios';
    const body = JSON.stringify({ nome: nome });
    fetch(url, {
        method,
        headers: {
            'Content-Type': 'application/json'
        },
        body
    })
    .then(response => response.json())
    .then(() => {
        id.value = '';
        nome.value = '';
        loadUserList();
    });
});

function loadUserList() {
    fetch('/usuarios')
        .then(response => response.json())
        .then(usuarios => {
            const listaUsuario = document.getElementById('listaUsuario');
            listaUsuario.innerHTML = '';
            usuarios.forEach(usuario => {
                listaUsuario.innerHTML += `<p>${usuario.nome}</p>`;
            });
        })
        .catch(error => {
            console.error('Erro ao carregar lista de usuários:', error);
        });
}

// Chamar a função para carregar a lista de usuários ao carregar a página
loadUserList();