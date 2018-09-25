package <missing>;

public class GlobalMembers
{
	public static void Input(tangible.RefObject<String> a, tangible.RefObject<String> b, tangible.RefObject<String> c)
	{
	a.argValue = new Scanner(System.in).nextLine();
	b.argValue = new Scanner(System.in).nextLine();
	c.argValue = new Scanner(System.in).nextLine();
	}
	public static void Swap(tangible.RefObject<String> str, tangible.RefObject<String> FindWord, tangible.RefObject<String> SwapWord)
	{
	 int j;
	 int s;
	 int k;
	 int i = 0;
	 int SwapWordLength;
	 int strLength;
	 int FindWordLength;
	 int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p2;
	 p1 = str.argValue;
	 p2 = FindWord.argValue;
	 strLength = str.argValue.length();
	 FindWordLength = FindWord.argValue.length();
	 SwapWordLength = SwapWord.argValue.length();
	 n = SwapWordLength - FindWordLength;
	 while (*p1 != '\0')
	 {
	   if (*p1 == *p2)
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
	  if (*p2 == '\0' && (*(p1 - FindWordLength - 1) == ' ' || i - FindWordLength - 2 < 0))
	  {
	   if (n < 0)
	   {
		j = i - FindWordLength;
		for (k = 0; k < SwapWordLength; k++)
		{
		 str.argValue.charAt(j++) = SwapWord.argValue.charAt(k);
		}
		for (s = i; s < strLength; s++)
		{
		 str.argValue.charAt(j++) = str.argValue.charAt(s);
		}
		while (j < strLength)
		{
		 str.argValue.charAt(j++) = '\0';
		}
		strLength = str.argValue.length();
		i += n;
		p1 += n;
	   }
	   else
	   {
		for (s = strLength + n; s > i; s--)
		{
		 str.argValue.charAt(s) = str.argValue.charAt(strLength--);
		}
		j = i - FindWordLength;
		for (k = 0; k < SwapWordLength; k++)
		{
		 str.argValue.charAt(j++) = SwapWord.argValue.charAt(k);
		}
		strLength = str.argValue.length();
		i += n;
		p1 += n;
	   }
	  }
	  p2 = FindWord.argValue;
	 }
	}
	public static void Main()
	{
	 String sen = new String(new char[MAX]);
	 String old = new String(new char[LEN]);
	 String new = new String(new char[LEN]);
 tangible.RefObject<String> tempRef_sen = new tangible.RefObject<String>(sen);
 tangible.RefObject<String> tempRef_old = new tangible.RefObject<String>(old);
 tangible.RefObject<String> tempRef_new = new tangible.RefObject<String>(new);
	 Input(tempRef_sen, tempRef_old, tempRef_new);
	 new = tempRef_new.argValue;
	 old = tempRef_old.argValue;
	 sen = tempRef_sen.argValue;
 tangible.RefObject<String> tempRef_sen2 = new tangible.RefObject<String>(sen);
 tangible.RefObject<String> tempRef_old2 = new tangible.RefObject<String>(old);
 tangible.RefObject<String> tempRef_new2 = new tangible.RefObject<String>(new);
	 Swap(tempRef_sen2, tempRef_old2, tempRef_new2);
	 new = tempRef_new2.argValue;
	 old = tempRef_old2.argValue;
	 sen = tempRef_sen2.argValue;
	 System.out.println(sen);
	}
}

