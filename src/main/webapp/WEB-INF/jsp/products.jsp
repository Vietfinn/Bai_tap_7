<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>Products</title>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<h2>Products Sorted by Price</h2>
<div id="product-list"></div>
<script>
  $.ajax({
    url: '/graphql',
    method: 'POST',
    contentType: 'application/json',
    data: JSON.stringify({ query: '{ productsSortedByPrice { id title price } }' }),
    success: function(res) {
      let products = res.data.productsSortedByPrice;
      let html = '<ul>';
      products.forEach(p => html += '<li>' + p.title + ' - $' + p.price + '</li>');
      html += '</ul>';
      $('#product-list').html(html);
    }
  });
</script>
</body>
</html>