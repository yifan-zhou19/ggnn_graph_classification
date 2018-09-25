package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int MyStrCmp = new int(char * pStr1,char * pStr2);
	 String a1 = new String(new char[81]);
	 String a2 = new String(new char[81]);
	 int t;
	 a1 = new Scanner(System.in).nextLine();
	 a2 = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_a1 = new tangible.RefObject<String>(a1);
	tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a2);
		t = MyStrCmp(tempRef_a1, tempRef_a2);
		a2 = tempRef_a2.argValue;
		a1 = tempRef_a1.argValue;
	 if (t == 1)
	 {
		 System.out.print(">");
	 }
	 if (t == 0)
	 {
		 System.out.print("=");
	 }
	 if (t == -1)
	 {
		 System.out.print("<");
	 }
	 System.out.print("\n");
	 return 0;
	}

	public static int MyStrCmp(tangible.RefObject<String> pStr1, tangible.RefObject<String> pStr2)
	{
	 int i;
	 int t;
	 String b1 = new String(new char[81]);
	 String b2 = new String(new char[81]);
	 for (i = 0;pStr1.argValue.charAt(i) != '\0';i++)
	 {
	  if (pStr1.argValue.charAt(i) >= 'A' && pStr1.argValue.charAt(i) <= 'Z')
	  {
	  *(pStr1.argValue.Substring(i)) = *(pStr1.argValue.Substring(i)) + 32;
	  }
	 }
	 for (i = 0;pStr2.argValue.charAt(i) != '\0';i++)
	 {
	  if (pStr2.argValue.charAt(i) >= 'A' && pStr2.argValue.charAt(i) <= 'Z')
	  {
	  *(pStr2.argValue.Substring(i)) = *(pStr2.argValue.Substring(i)) + 32;
	  }
	 }
			t = 0;
	  if (pStr1.argValue.length() > pStr2.argValue.length())
	  {
		  t = 1;
	  }
		 if (pStr1.argValue.length() < pStr2.argValue.length())
		 {
			 t = -1;
		 }
			if (pStr1.argValue.length() == pStr2.argValue.length())
			{
	   for (i = 0;i < pStr1.argValue.length();i++)
	   {
		if (*(pStr1.argValue.Substring(i)) > *(pStr2.argValue.Substring(i)))
		{
		 t = 1;
						break;
		}
		if (*(pStr1.argValue.Substring(i)) < *(pStr2.argValue.Substring(i)))
		{
		 t = -1;
		 break;
		}
		if (*(pStr1.argValue.Substring(i)) == *(pStr2.argValue.Substring(i)))
		{
		 continue;
		}
	   }
			}
	 return (t);
	}
}

