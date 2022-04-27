package com.flexcode.adanianlabsinterview



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.flexcode.adanianlabsinterview.databinding.FragmentEditTrainingBinding
import com.google.android.material.bottomsheet.BottomSheetDialog


class EditTrainingFragment : Fragment() {

    private var _binding: FragmentEditTrainingBinding? = null
    private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEditTrainingBinding.inflate(inflater,container,false)


        binding.btnSave.setOnClickListener {
            val view: View = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)
            val dialog = BottomSheetDialog(requireContext(), R.style.BottomSheetDialog) // Style here

            dialog.setContentView(view)
            dialog.show()


        }

        return binding.root
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}