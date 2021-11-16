const validateCart = () => {
    $.ajax({
        method: 'POST',
        url: `/api/cart`,
        dataType: "json",
        contentType: 'application/json'
    }).done((response) => {
        window.location.href = "http://172.18.13.117:8080/authenticate?callback=172.18.13.109:8080&operation=validate"
    })
}