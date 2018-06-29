$(document).ready(function() {
    var id = '6';
    $.ajax({
        type: 'GET',
        url: 'api/users/one/6',
        success: function (orders) {
            $.each(orders, function (i, data) {
                $('.greeting-id').append(data.id);
                $('.greeting-content').append(data.name);
                $('.all').append(data.age, data.surname, data.surname );
            });
        }
    });
});