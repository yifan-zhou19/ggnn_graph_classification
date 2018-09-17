package <missing>;

public class GlobalMembers
{
	public static int compare1(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p1,*p2;
	 float p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p2;
	 float p2;
	 p1 = (float)elem1;
	 p2 = (float)elem2;
	 if (p1 > p2)
	 {
		 return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}

	public static int compare2(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p1,*p2;
	 float p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p2;
	 float p2;
	 p1 = (float)elem1;
	 p2 = (float)elem2;
	 if (p2 > p1)
	 {
		 return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}

	public static int Main()
	{
		int i;
		int n;
		int k1 = 0;
		int k2 = 0;
		String c = new String(new char[7]);
		float[] MH = new float[40];
		float[] FH = new float[40];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (strcmp(c,"male") == 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					MH[k1++] = Float.parseFloat(tempVar3);
				}
			}
			else if (strcmp(c,"female") == 0)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					FH[k2++] = Float.parseFloat(tempVar4);
				}
			}
		}
		qsort(MH,k1,(Float.SIZE / Byte.SIZE),compare1);
		qsort(FH,k2,(Float.SIZE / Byte.SIZE),compare2);
		for (i = 0;i < k1;i++)
		{
			System.out.printf("%.2f ",MH[i]);
		}
		for (i = 0;i < k2 - 1;i++)
		{
			System.out.printf("%.2f ",FH[i]);
		}
		System.out.printf("%.2f\n",FH[k2 - 1]);
		return 0;
	}
}

