package com.example.moth4quiz

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import com.example.moth4quiz.databinding.ActivityMainBinding
import com.example.moth4quiz.databinding.FragmentMainBinding

class MainFragment : Fragment(),TextWatcher {

    private lateinit var adapter: Adapter
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding= FragmentMainBinding.inflate(layoutInflater,container,false)
        binding.btnAdd.setOnClickListener {
            val dialog =AlertDialog(this)
            dialog.dialog?.window?.attributes?.width = WindowManager.LayoutParams.MATCH_PARENT
            dialog.show(childFragmentManager,"sdkja")
        }

        adapter = Adapter(arrayListOf()){
            Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.mainFragment , UsersFragment())
            transaction.disallowAddToBackStack()
            transaction.commit()

        }

        return binding.root
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        TODO("Not yet implemented")
    }

    override fun afterTextChanged(p0: Editable?) {
        TODO("Not yet implemented")
    }

}