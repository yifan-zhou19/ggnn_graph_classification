package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String s = new String(new char[50]);
	  String w = new String(new char[50]);
	  int i;
	  int j;
	  int a;
	  int b;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  w = tempVar2.charAt(0);
		  }
		a = s.length();
		b = w.length();
		for (i = 0;i < b;i++)
		{
		   if (s.charAt(0) == w.charAt(i))
		   {
			 for (j = 0;j < a;j++)
			 {
				 if (s.charAt(j) != w.charAt(i + j))
				 {
				 break;
				 }
			 }
				if (j == a)
				{
			System.out.printf("%d",i);
			break;
				}
		   }
		}
	}

}

