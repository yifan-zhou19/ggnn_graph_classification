package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String c1 = new String(new char[50]);
	 String c2 = new String(new char[50]);
	 int i;
	 int a;
	 int b;
	 int j;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 c1 = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 c2 = tempVar2.charAt(0);
	 }
	 a = c1.length();
	 b = c2.length();



	 for (i = 0;i < b;i++)
	 {
		 if (c2.charAt(i) != c1.charAt(0))
		 {
			 continue;
		 }
		 if (c2.charAt(i) == c1.charAt(0))
		 {
		  for (j = i,k = 0;j < b,k < a;j++,k++)
		  {
		  if (c2.charAt(j) == c1.charAt(k))
		  {
			  continue;
		  }
		  else
		  {
			  break;
		  }
		  }




		 if (c2.charAt(i + a - 1) == c1.charAt(a - 1))
		 {
		   System.out.printf("%d\n",i);
		   break;
		 }


		 }
	 }
	}
}

