// Função para criar novo usuário
function createUser(userData) {
    event.preventDefault();
    fetch('/usuario/save', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(userData),
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Erro ao criar usuário');
        }
        console.log('Novo usuário criado com sucesso');
    })
    .catch(error => console.error('Erro ao criar usuário:', error));
}




