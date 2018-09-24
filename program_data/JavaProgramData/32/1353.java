package <missing>;

public class GlobalMembers
{
	/*??
	 ?2??????????
	 ????
	 ?1?????????n????????2???1?????a??2????b(a > b)??????????????????????100?
	 ????
	 n????????????????????
	 ????
	 2
	 
	 9999999999999999999999999999999999999
	 
	 9999999999999
	 
	 
	 
	 5409656775097850895687056798068970934546546575676768678435435345
	 
	 1
	 ????
	 9999999999999999999999990000000000000
	 
	 5409656775097850895687056798068970934546546575676768678435435344
	 */
	public static String imim = new String(new char[101]);
	public static String isub = new String(new char[101]);
	public static String istore = new String(new char[101]);
	public static int carry = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * q = null;
	public static void subtraction()
	{
		if (q == isub)
		{
			*p = (*p - *q - carry + '0');
		}
		else
		{
			if (*p >= (*q + carry))
			{

				*p = (*p - *q - carry + '0');
				carry = 0;
			}
			else
			{
				*p = (*p + 10 - *q - carry + '0');
				carry = 1;
			}
			p--;
			q--;
			subtraction();
		}
	}
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(imim,'0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(isub,'0',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(istore,'0',(Character.SIZE / Byte.SIZE));
			carry = 0;
			imim = ConsoleInput.readToWhiteSpace(true).charAt(0);
			istore = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int gap = 0;
			gap = imim.length() - istore.length();
			for (int i = 0;i <= istore.length();i++)
			{
				isub = tangible.StringFunctions.changeCharacter(isub, i + gap, istore.charAt(i));
			}
			p = imim + imim.length() - 1;
			q = isub + isub.length() - 1;
			subtraction();
			System.out.print(imim);
			System.out.print("\n");
		}
		return 0;
	}


}

