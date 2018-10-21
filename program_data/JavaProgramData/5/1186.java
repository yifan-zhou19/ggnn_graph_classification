package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String zfc1 = new String(new char[500]);
	String zfc2 = new String(new char[500]);
	int i;
	int j;
	int t;
	int len1;
	int len2;
	double n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Double.parseDouble(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   zfc1 = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   zfc2 = tempVar3.charAt(0);
	   }
	   len1 = zfc1.length();
	   len2 = zfc2.length();
	   for (i = 0;zfc1.charAt(i);i++)
	   {
	   if (len2 != len1 || (zfc1.charAt(i) != 'A' && zfc1.charAt(i) != 'T' && zfc1.charAt(i) != 'G' && zfc1.charAt(i) != 'C') || (zfc2.charAt(i) != 'A' && zfc2.charAt(i) != 'T' && zfc2.charAt(i) != 'G' && zfc2.charAt(i) != 'C'))
	   {
	   System.out.print("error");
	   return 0;
	   }
	   }






		t = 0;
		for (j = 0;zfc1.charAt(j) != '\0';j++)
		{
			if (zfc1.charAt(j) == zfc2.charAt(j))
			{
			t++;
			}
		}
		if (1.0 * t / len1 > n)
		{
		System.out.print("yes");
		return 0;
		}
		else
		{
		System.out.print("no");
		}





	return 0;


	}
}

