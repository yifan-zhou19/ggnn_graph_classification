package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int n;
	int m = 0;
	int[] sort = new int[10];
	int j = 0;
	float c;
	float d = 0F;
	float GPA;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int e = 0;e < n;e++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	sort[e] = a;
	m += a;
	}
	while (j < n)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (b < 60)
	{
		c = 0F;
	}
	else if (b < 65)
	{
		c = 1.0F;
	}
	 else if (b < 68)
	 {
		 c = 1.5F;
	 }
	  else if (b < 72)
	  {
		  c = 2.0F;
	  }
	  else if (b < 75)
	  {
		  c = 2.3F;
	  }
	  else if (b < 78)
	  {
		  c = 2.7F;
	  }
	  else if (b < 82)
	  {
		  c = 3.0F;
	  }
	  else if (b < 85)
	  {
		  c = 3.3F;
	  }
	  else if (b < 90)
	  {
		  c = 3.7F;
	  }
	  else if (b < 101)
	  {
		  c = 4.0F;
	  }
	d += c * sort[j];
	j++;
	}
	GPA = 1.0 * d / m;
	System.out.printf("%.2f",GPA);
	return 0;
	}
}

