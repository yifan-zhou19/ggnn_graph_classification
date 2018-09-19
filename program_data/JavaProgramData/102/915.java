package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a1;
	int a2;
	int j;
	double[] man = new double[40];
	double[] woman = new double[40];
	double b1;
	double b2;
	String s = new String(new char[7]);
	a1 = 0;
	a2 = 0;
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
		 s = tempVar2.charAt(0);
	 }
	 if (s.charAt(0) == 'm')
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 man[a1] = Double.parseDouble(tempVar3);
		 }
		 a1++;
	 }
	 if (s.charAt(0) == 'f')
	 {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 woman[a2] = Double.parseDouble(tempVar4);
		 }
		 a2++;
	 }
	}
	for (i = 0;i < a1 - 1;i++)
	{
	 for (j = 0;j < a1 - 1 - i;j++)
	 {
	  if (man[j] > man[j + 1])
	  {
	   b1 = man[j + 1];
	   man[j + 1] = man[j];
	   man[j] = b1;
	  }
	 }
	}
	for (i = 0;i < a2 - 1;i++)
	{
	 for (j = 0;j < a2 - 1 - i;j++)
	 {
	  if (woman[j] < woman[j + 1])
	  {
	   b2 = woman[j + 1];
	   woman[j + 1] = woman[j];
	   woman[j] = b2;
	  }
	 }
	}
	for (i = 0;i < a1;i++)
	{
		System.out.printf("%.2lf ",man[i]);
	}
	for (i = 0;i < a2 - 1;i++)
	{
		System.out.printf("%.2lf ",woman[i]);
	}
	System.out.printf("%.2lf",woman[a2 - 1]);
	return 0;
	}
}

