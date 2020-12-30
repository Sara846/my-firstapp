package com.example.azkar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val str2 = listOf("(الله لا إله إلا هو الحي القيوم لا تأخذه سنة ولا نوم له ما في السموات وما في الأرض من ذا الذي يشفع عنده إلا بإذنه يعلم ما بين أيديهم وما خلفهم ولا يحيطون بشيء من علمه إلا بما شاء وسع كرسيه السموات والأرض ولا يؤوده حفظهما وهو العلي العظيم)",
        "(قل هو الله أحد* الله الصمد* لم يلد ولم يولد* ولم يكن له كفوا أحد)",
        "(قل أعوذ برب الفلق* من شر ما خلق* ومن شر غاسق إذا وقب* ومن شر النفاثات في العقد* ومن شر حاسد إذا حسد)",
        "(قل أعوذ برب الناس* ملك الناس* إله الناس* من شر الوسواس الخناس* الذي يوسوس في صدور الناس* من الجنة و الناس)",
        "(أمسينا وأمسى الملك لله، والحمد لله، لا إله إلا الله وحده لا شريك له، له الملك وله الحمد وهو على كل شيء قدير، رب أسألك خير ما في هذه الليلة وخير ما بعدها، وأعوذ بك من شر ما في هذه الليلة وشر ما بعدها، رب أعوذ بك من الكسل وسوء الكبر، رب أعوذ بك من عذاب في النار وعذاب في القبر)",
        "(اللهم بك أمسينا، وبك أصبحنا، وبك نحيا، وبك نموت وإليك المصير)",
        "(اللهم أنت ربي لا إله إلا أنت، خلقتني وأنا عبدك، وأنا على عهدك ووعدك ما استطعت، أعوذ بك من شر ما صنعت، أبوء لك بنعمتك علي، وأبوء بذنبي فاغفر لي فإنه لا يغفر الذنوب إلا أنت)",
        "(اللهم إني أمسيت أشهدك، وأشهد حملة عرشك، وملائكتك، وجميع خلقك، أنك أنت الله لا إله إلا أنت وحدك لا شريك لك، وأن محمدا عبدك ورسولك)")

        val recyclerView = findViewById<RecyclerView>(R.id.rv2)
        recyclerView.adapter = ItemAdapter(this , str2)
    }
}