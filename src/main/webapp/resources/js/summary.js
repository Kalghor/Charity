const btnSummary = document.querySelector("#summaryBtn");
const numberOfBags = document.querySelector("#numberOfBags");
const institution = document.querySelectorAll("#institution");
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

    numberOfBagsSummary.innerText = numberOfBags.value + " worki";
    institutionSummary.innerHTML = "Dla " + institution.innerHTML;
    streetSummary.innerHTML = street.value;
    citySummary.innerHTML = city.value;
    zipCodeSummary.innerHTML = zipCode.value;
    phoneNumberSummary.innerHTML = phoneNumber.value;
    pickUpDateSummary.innerHTML = pickUpDate.value;
    pickUpTimeSummary.innerHTML = pickUpTime.value;
    pickUpCommentSummary.innerHTML = pickUpComment.value;

    console.log(institution)
    // console.log()
    // console.log(institution)
})