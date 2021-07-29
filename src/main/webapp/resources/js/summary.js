const btnSummary = document.querySelector("#summaryBtn");
const numberOfBags = document.querySelector("#numberOfBags");
const street = document.querySelector("#street");
const city = document.querySelector("#city");
const zipCode = document.querySelector("#zipCode");
const phoneNumber = document.querySelector("#phoneNumber");
const pickUpDate = document.querySelector("#pickUpDate");
const pickUpTime = document.querySelector("#pickUpTime");
const pickUpComment = document.querySelector("#pickUpComment");


let numberOfBagsSummary = document.querySelector("#numberOfBagsSummary");
const institutionSummary = document.querySelector("#institutionSummary");
const streetSummary = document.querySelector("#streetSummary");
const citySummary = document.querySelector("#citySummary");
const zipCodeSummary = document.querySelector("#zipCodeSummary");
const phoneNumberSummary = document.querySelector("#phoneNumberSummary");
const pickUpDateSummary = document.querySelector("#pickUpDateSummary");
const pickUpTimeSummary = document.querySelector("#pickUpTimeSummary");
const pickUpCommentSummary = document.querySelector("#pickUpCommentSummary");


btnSummary.addEventListener("click", ev => {
    debugger;
    const institution = document.querySelector(".institution:checked ~ .description .title");

    // institution.forEach(el => {
    //     if (el.checked) {
    //         institutionSummary.innerHTML = "Dla " + el.name;
    //         console.log(el.innerHTML);
    //     }
    // })

    numberOfBagsSummary.innerText = numberOfBags.value + " worki";
    institutionSummary.innerHTML = "Dla " + institution.innerHTML;
    streetSummary.innerHTML = street.value;
    citySummary.innerHTML = city.value;
    zipCodeSummary.innerHTML = zipCode.value;
    phoneNumberSummary.innerHTML = phoneNumber.value;
    pickUpDateSummary.innerHTML = pickUpDate.value;
    pickUpTimeSummary.innerHTML = pickUpTime.value;
    pickUpCommentSummary.innerHTML = pickUpComment.value;

    // console.log(institution)
})