const addArticle = (id, auth, username) => {
    $.ajax({
        method: 'POST',
        url: `/api/article/${id}?auth=${auth}&username=${username}`,
        dataType: "json",
        contentType: 'application/json'
    }).done((response) => {
        getCart(response.id)
        alert("Article n°" + id + " ajouté.")
    }).fail((xhr) => {
        console.log(JSON.parse(xhr.responseText))
    })
}

const getCart = (id) => {
    $.ajax({
        method: 'GET',
        url: `/api/cart/${id}`,
    }).done((response) => {
        const cartContent = document.getElementById('cart-content')
        cartContent.innerHTML = ""
        const ul = document.createElement('ul')
        ul.setAttribute('id', 'cartList')
        cartContent.appendChild(ul)
        response.articles.forEach(renderArticleList)

        function renderArticleList(element, index, arr) {
            const li = document.createElement('li')
            li.setAttribute('class', 'item')
            ul.appendChild(li)
            li.innerHTML = li.innerHTML + element.name
        }
    }).fail((xhr) => {
        console.log(JSON.parse(xhr.responseText))
    })
}