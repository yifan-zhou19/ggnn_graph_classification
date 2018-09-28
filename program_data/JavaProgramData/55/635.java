package <missing>;

public class GlobalMembers
{
	/**
	?originBase?number???10?? 
	*/
	public static int change2Dec(tangible.RefObject<String> number, int len_number, int originBase)
	{

	  int result = 0;
	  //for?? 
	  for (int i = 0; i < len_number; i++)
	  {
		//???????10????????
		int numberBit = 0;
		if (number.argValue.charAt(i) >= '0' && number.argValue.charAt(i) <= '9')
		{
		  numberBit = number.argValue.charAt(i) - '0';
		}
		else if (number.argValue.charAt(i) >= 'a' && number.argValue.charAt(i) <= 'z')
		{
		  numberBit = number.argValue.charAt(i) - 'a' + 10;
		}
		else
		{
		  numberBit = number.argValue.charAt(i) - 'A' + 10;
		}

		//???????????
		int position = len_number - i;

		//???????????? 
		int currentBitValue = numberBit;
		for (int i = 1; i < position; i++)
		{
		  currentBitValue *= originBase;
		}
		result += currentBitValue;
	  }
	  return result;
	}

	/**
	?10??decNumber???newBase??????newNumber???????????? 
	*/
	public static int changeDec2NewBase(int decNumber, int newBase, tangible.RefObject<String> newNumber)
	{
		int[] bitValue = new int[100]; //???????????????????
		int length = 0; //???????
		while (decNumber / newBase > 0)
		{
			bitValue[length++] = decNumber % newBase; //??
			decNumber /= newBase;
		}
		bitValue[length++] = decNumber; //??????

		for (int i = length - 1,j = 0; i >= 0; i--,j++)
		{
			int currentBit = bitValue[i];
			if (currentBit < 10)
			{
				newNumber.argValue.charAt(j) = currentBit + '0';
			}
			else
			{
				newNumber.argValue.charAt(j) = currentBit + 'A' - 10;
			}
		}
		return length;
	}

	public static int Main()
	{
		int originBase; //????
		int newBase; //???
		String number = new String(new char[100]); //????????
		String newNumber = new String(new char[100]); //??????
		originBase = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		number = ConsoleInput.readToWhiteSpace(true).charAt(0);
		newBase = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int len_number; //????????
		int len_newNumber; //????????

		for (int i = 0; i < 100; i++)
		{
			if (number.charAt(i) == 0)
			{
			   len_number = i;
			   break;
			}
		}
	tangible.RefObject<String> tempRef_number = new tangible.RefObject<String>(number);
		int decNumber = change2Dec(tempRef_number, len_number, originBase);
		number = tempRef_number.argValue;
	tangible.RefObject<String> tempRef_newNumber = new tangible.RefObject<String>(newNumber);
		len_newNumber = changeDec2NewBase(decNumber, newBase, tempRef_newNumber);
		newNumber = tempRef_newNumber.argValue;
		newNumber = newNumber.substring(0, len_newNumber);
		System.out.print(newNumber);
		System.out.print("\n");

	}



}

