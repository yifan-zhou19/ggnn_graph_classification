package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int s;
		int i;
	float a = 0F;
	float b = 0F;
	float c = 0F;
	float d = 0F;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s = Integer.parseInt(tempVar2);
		  }
	   if (s <= 18)
	   {
		   a = a + 1;
	   }
	   if (s > 18 && s < 36)
	   {
		   b = b + 1;
	   }
	   if (s > 35 && s < 61)
	   {
		   c = c + 1;
	   }
	   if (s > 60)
	   {
		   d = d + 1;
	   }
	  }

	System.out.printf("1-18: %.2f%%\n",a / n * 100);
	System.out.printf("19-35: %.2f%%\n",b / n * 100);
	System.out.printf("36-60: %.2f%%\n",c / n * 100);
	System.out.printf("60??: %.2f%%",d / n * 100);
	}
}

