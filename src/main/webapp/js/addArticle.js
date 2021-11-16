const addArticle = (id) => {
    $.ajax({
        method: 'POST',
        url: `/api/article/${id}`,
        dataType: "json",
        contentType: 'application/json'
    }).done((response) => {
        alert("Article n°" + id + " ajouté.")
    })
}