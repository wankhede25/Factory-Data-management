//
//     function getData() {
//     fetch('/api/data', {
//         method: 'GET'
//     })
//         .then(response => response.text())
//         .then(data => {
//             document.getElementById('responseArea').innerText = 'GET Response: ' + data;
//         })
// }
//
//     function postData() {
//     fetch('/api/data', {
//         method: 'POST',
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify({ name: "New Item" })
//     })
//         .then(response => response.text())
//         .then(data => {
//             document.getElementById('responseArea').innerText = 'POST Response: ' + data;
//         })
// }
//
//     function updateData() {
//     fetch('/api/data/1', { // Assume id = 1
//         method: 'PUT',
//         headers: {
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify({ name: "Updated Item" })
//     })
//         .then(response => response.text())
//         .then(data => {
//             document.getElementById('responseArea').innerText = 'PUT Response: ' + data;
//         })
// }
//
//     function deleteData() {
//     fetch('/api/data/1', { // Assume id = 1
//         method: 'DELETE'
//     })
//         .then(response => response.text())
//         .then(data => {
//             document.getElementById('responseArea').innerText = 'DELETE Response: ' + data;
//         })
// }
