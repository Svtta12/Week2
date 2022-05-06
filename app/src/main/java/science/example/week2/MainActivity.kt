package science.example.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private val TAG = "Main Activity"
    private var button_activity2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_activity2 = findViewById<View>(R.id.button_activity2) as Button
        button_activity2?.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }

        Log.i(TAG, "onCreate() called")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() called")
    }
}


//Задание 2.3: Открывать-закрывать-сворачивать экран и смотреть, что будет происходить
//Наблюдаем за жизненным циклом Activity
//Запуск приложения: OnCreate() -> onStart() -> onResume()
//Выход из приложения(через кнопку Back): onPause() -> onStop() -> onDestroy()
//Нажать кнопку "Домой": onPause() -> onStop()
//Запуск приложения из недавно открытых: onRestart() -> onStart() ->onResume()
//Запуск другого приложения из области уведомлений: onPause() -> onStop()
//Если ответить на звонок: onPause(), после окончания разговора: onResume()
//Экран телефона гаснет: onPause() -> onStop()
//Экран снова включен: onRestart() -> onStart() -> onResume()
//При повороте(т.е смене ориентации):
//onPause() -> onStop() -> onDestroy() -> onCreate() -> onStart() -> onResume

//Задание 2.10: Для чего нужен жизненный цикл и какие задачи можно с помощью него решать?
//Так как в процессе работы в приложении пользователь может поворачивать экран, переключаться на другие
//задачи, отвечать на уведомления и т. д. и после  какого-либо из этих события должен
//без проблем продолжить работу с приложением. Для этого разработчик должен понимать, что
//происходит с приложением при каком-либо из этих действий и уметь управлять жизненным циклом компонентов.
//Например: Пользватель вводит какие-либо данные в нашем приложении, но в этот момент ему позвонили
//и он отвечает на звонок, следовательно разработчик должен учесть это и сделать так(как раз при помощи
//жизненного цикла), чтобы при возвращении к работе в нашем приложении, все данные внесенные пользователем
//были сохранены.

//Задача 2.11:Привести 3 примера использования жизненного цикла в реальных приложениях
//1.Сохранение введенной информации при ответе на звонок используются в приложениях: Aviasales,
//Delivery Club, Telegram и многие другие
//2.Пользователь производит поворот экрана, следовательно важно чтобы данные были сохранены и правильно
//отобразились в новой конфигурации. Приложения: GitHub, Vk, Discord и многие другие
//3.Пользователь через уведомления перешел в другое приложение, приложение стало не видно,
//следовательно воспроизведение видео необходимо поставить на паузу. Приложения: YouTube,
//Vk, любой браузер и многие другие