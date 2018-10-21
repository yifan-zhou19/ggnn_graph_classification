package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *yu[100][1000],g,h;
		double[][] yu = new double[100][1000]; //????????
		double g;
		double h;
		int k;
		int[] n = new int[100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				yu[i][j] = (float) malloc(8);
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					yu[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}
		for (i = 0;i < k;i++) //??????
		{
			for (g = 0,j = 0;j < n[i];j++)
			{
				g = g + yu[i][j];
			}
			g = g / n[i];
			for (h = 0,j = 0;j < n[i];j++)
			{
				h = h + (yu[i][j] - g) * (yu[i][j] - g);
			}
			h = h / n[i];
			h = Math.sqrt(h);
			System.out.printf("%.5f\n",h);
		} //???????????????��������
	}

}

