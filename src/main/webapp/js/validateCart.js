const validateCart = (auth, username) => {
    $.ajax({
        method: 'POST',
        url: `/api/command?auth=${auth}&username=${username}`,  // params stockés dans le model
        dataType: "json",
        contentType: 'application/json'
    }).done((response) => {
        window.location.href = "http://172.28.101.111:8080/authenticate?callback=http://172.18.13.110:8080/checkout&operation=validate"
    }).fail((xhr) => {
        console.log(JSON.parse(xhr.responseText))
        alert("Vous devez être connecté.")
    })
}