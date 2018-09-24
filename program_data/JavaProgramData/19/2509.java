package <missing>;

public class GlobalMembers
{
	public static void Swap(tangible.RefObject<String> str, tangible.RefObject<String> FindWord, tangible.RefObject<String> SwapWord)
	{

	 int j;
	 int s;
	 int k;
	 int i = 0;
	 int SwapWordLength;
	 int yc;
	 int FindWordLength;
	 int n;

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p2;

	 p1 = str.argValue;

	 p2 = FindWord.argValue;

	 yc = str.argValue.length();

	 FindWordLength = FindWord.argValue.length();

	 SwapWordLength = SwapWord.argValue.length();

	 n = SwapWordLength - FindWordLength;

	 while (*p1 != '\0')
	 {

	   if ((*p1 == *p2) && (!Character.isLetter(*(p1 - 1))))
	   {

	   while ((*p1 == *p2) && (*p2 != '\0'))

	   {
		   p1++;
		   p2++;
		   i++;
	   }
	   }

	  else
	  {
		  p1++;
		  i++;
	  }

	  if ((*p2 == '\0') && (Character.isLetter(*p1) == 0))
	  {



	   if (n < 0)
	   {

		j = i - FindWordLength;

		for (k = 0; k < SwapWordLength; k++)
		{

		 str.argValue.charAt(j++) = SwapWord.argValue.charAt(k);
		}

		for (s = i; s < yc; s++)
		{

		 str.argValue.charAt(j++) = str.argValue.charAt(s);
		}

		while (j < yc)
		{

		 str.argValue.charAt(j++) = '\0';
		}

		 yc = str.argValue.length();

		i += n;

		p1 += n;

	   }

	   else

	   {

		for (s = yc + n; s > i; s--)
		{

		 str.argValue.charAt(s) = str.argValue.charAt(yc--);
		}

		j = i - FindWordLength;

		for (k = 0; k < SwapWordLength; k++)
		{

		 str.argValue.charAt(j++) = SwapWord.argValue.charAt(k);
		}

		yc = str.argValue.length();

		i += n;

		p1 += n;

	   }

	  }

	  p2 = FindWord.argValue;

	 }

	}

	public static int Main()
	{

	 String sen = new String(new char[MAX]);
	 String old = new String(new char[LEN]);
	 String a = new String(new char[LEN]);

	 sen = new Scanner(System.in).nextLine();

	 old = new Scanner(System.in).nextLine();

	 a = new Scanner(System.in).nextLine();

 tangible.RefObject<String> tempRef_sen = new tangible.RefObject<String>(sen);
 tangible.RefObject<String> tempRef_old = new tangible.RefObject<String>(old);
 tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	 Swap(tempRef_sen, tempRef_old, tempRef_a);
	 a = tempRef_a.argValue;
	 old = tempRef_old.argValue;
	 sen = tempRef_sen.argValue;

	 System.out.println(sen);
	 return 0;

	}


}

