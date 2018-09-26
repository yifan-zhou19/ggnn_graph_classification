package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[100]);
	 String a = new String(new char[100]);
	 String b = new String(new char[100]);
	 int i;
	 int j;
	 int l;
	 int m;
	 int e = 0;
	 String str;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(s,0,100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(a,0,100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(b,0,100);

	 s = new Scanner(System.in).nextLine();
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }

	 l = a.length();
	 m = s.length();
	 str = s;

	 for (i = 0;i <= m - l;i++)
	 { //???????
	  e = 0;
	  for (j = 0;j < l;j++)
	  {
		   if (s.charAt(i + j) != a.charAt(j))
		   {
			e++;
			break;
		   }
	  }
		//e???0,???a??

	  if (e == 0)
	  {
	   s = tangible.StringFunctions.changeCharacter(s, i, '\0');
	   System.out.printf("%s",str);
	   System.out.printf("%s",b);
	   str = s.Substring(i) + j;
	   break;
	  }

	 }
	 System.out.printf("%s",str);
	 return 0;
	}

}

