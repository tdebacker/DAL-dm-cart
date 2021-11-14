const validateCart = () => {
    $.ajax({
        method: 'POST',
        url: `/api/cart`,
        dataType: "json",
        contentType: 'application/json'
    }).done((response) => {
        // document.location.href = `/authenticate` //todo: redirect to the broker endpoint
        alert("Le panier est enregistré!")
    })
}