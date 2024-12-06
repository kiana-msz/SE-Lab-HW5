# SE-Lab-HW5

# بخش اول: اجرای Profiling روی JavaCup و بهبود آن

در این بخش، ابتدا عملیات **Profiling** را با استفاده از **YourKit** روی کلاس `JavaCup` انجام می‌دهیم. سپس **snapshot** این اجرا را ذخیره کرده و بررسی می‌کنیم. همانطور که در تصاویر زیر قابل مشاهده است، در ۳ نقطه **hot spot** داریم که نقاطی هستند که مصرف منابع در آن‌ها به طور غیرعادی بالا است. با ریز شدن روی این ۳ نقطه می‌بینیم که هر سه‌ی‌ آن‌ها حین اجرای تابع `temp` رخ داده‌اند:

![Screenshot 2024-12-06 at 11.49.01 AM](Screenshot%202024-12-06%20at%2011.49.01%20AM.png)
![Screenshot 2024-12-06 at 11.49.47 AM](Screenshot%202024-12-06%20at%2011.49.47%20AM.png)
![Screenshot 2024-12-06 at 11.49.52 AM](Screenshot%202024-12-06%20at%2011.49.52%20AM.png)


همچنین با بررسی نمودارهای مصرف منابع، می‌بینیم که در نقطه‌ای که افزایش ناگهانی مصرف داریم، تابع `temp` در حال اجرا بوده است:

![Screenshot 2024-12-06 at 11.50.40 AM](Screenshot%202024-12-06%20at%2011.50.40%20AM.png)


دلیل این موضوع هم استفاده‌ی نابهینه از `ArrayList` در این تابع است که حافظه و پردازنده زیادی را هدر می‌دهد. با تبدیل آن به جمع معمولی و ذخیره نکردن مقادیر میانی می‌توان عملکرد را بهبود داد. در تصویر زیر می‌بینیم که پس از اعمال این تغییر دیگر **hot spot** ای نداریم.

![Screenshot 2024-12-06 at 11.55.11 AM](Screenshot%202024-12-06%20at%2011.55.11%20AM.png)
