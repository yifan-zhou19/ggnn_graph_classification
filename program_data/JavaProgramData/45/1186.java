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


	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 s = new Scanner(System.in).nextLine();

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
	   System.out.printf("%d",i - 1);
	   break;
	  }

	 }

	 return 0;
	}

}

