package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int heng;
		int lie;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			heng = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}

		int[][] p;
		p = new int[heng];
		for (i = 0;i < heng;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			*(p + i) = (int)malloc(lie * (Integer.SIZE / Byte.SIZE));
			for (j = 0;j < lie;j++)
			{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 *(p + i) + j = tempVar3;
			 }
			}
		}
			for (j = 0;j < lie;j++)
			{
			  for (k = j,l = 0;k >= 0;k--,l++)
			  {
				  if (l < heng)
				  {
			  System.out.printf("%d\n",*(*(p + l) + k));
				  }
				  else
				  {
					  break;
				  }
			  }
			}
			 for (j = lie;j < heng + lie-1;j++)
			 {
				 for (k = lie-1,l = j - (lie-1);k >= 0;k--,l++)
				 {
					 if (l < heng)
					 {
				 System.out.printf("%d\n",*(*(p + l) + k));
					 }
					 else
					 {
						 break;
					 }
				 }
			 }
	}
}

