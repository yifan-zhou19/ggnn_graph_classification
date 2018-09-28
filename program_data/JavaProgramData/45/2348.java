package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[100]);
	   String w = new String(new char[100]);
	   String t = new String(new char[100]);
	   char ch;
	   int i;
	   int j;
	   int flag;

	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   ch = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   w = tempVar3.charAt(0);
	   }
	   for (i = 0;i < w.length();i++)
	   {
			 flag = 1;
			 for (j = 0;j < s.length();j++)
			 {
				if (s.charAt(j) != w.charAt(i + j))
				{
				   flag = 0;
				   break;
				}
			 }
			 if (flag == 1)
			 {
				System.out.printf("%d",i);
				break;
			 }
	   }

	   return 0;
	}
}

