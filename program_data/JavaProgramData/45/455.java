package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[50]);
		String p1;
		String str2 = new String(new char[50]);
		String p2;
		  int i;
		  int d;
		  int j;
	p1 = str1;
	 p2 = str2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p2 = tempVar2.charAt(0);
		}

	  for (i = 0; * (p2.Substring(i)) != 0;i++)
	  {
		 if (*(p2.Substring(i)) == p1)
		 {
			 d = i;
	 for (j = 0; * (p1.Substring(j)) != 0;j++)
	 {
				 if (*(p2.Substring(i)) == *(p1.Substring(j)))
				 {
			  i++;
				 }
				 else
				 {
					 j = 0;
					 break;
				 }
	 }
	 if (j != 0)
	 {
		 break;
	 }
		 }


	  }
		System.out.printf("%d",d);
	}



}

