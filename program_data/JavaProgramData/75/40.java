package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int[] numary1 = new int[1000];
		int[] numary2 = new int[1000];
		char temp;
		int min = 1000;
		int max = 0;
		int t = 0;
		int count1 = 0;
		int count2 = 0;
		while (t == 0)
		{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						numary1[count1] = Integer.parseInt(tempVar);
					}
					String tempVar2 = ConsoleInput.scanfRead(null, 1);
					if (tempVar2 != null)
					{
						temp = tempVar2.charAt(0);
					}
					if (numary1[count1] > max)
					{
										  max = numary1[count1];
					}
					if (numary1[count1] < min)
					{
										  min = numary1[count1];
					}
					count1++;
					if (temp == '\n')
					{
							  t++;
					}
		}
		while (t == 1)
		{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						numary2[count2] = Integer.parseInt(tempVar3);
					}
					String tempVar4 = ConsoleInput.scanfRead(null, 1);
					if (tempVar4 != null)
					{
						temp = tempVar4.charAt(0);
					}
					if (numary2[count2] > max)
					{
										  max = numary2[count2];
					}
					if (numary2[count2] < min)
					{
										  min = numary2[count2];
					}
					count2++;
					if (count2 == count1)
					{
							  t++;
					}
		}
		int i;
		int j;
		int k;
		int[] tong = new int[1000];
		int maxpopu = 0;
		for (i = min; i <= max ; i++)
		{
				 for (j = 0; j < count1; j++)
				 {
						  if (i >= numary1[j] != 0 && i < numary2[j])
						  {
										   tong[i]++;
						  }
				 }
				 if (tong[i] > maxpopu)
				 {
							 maxpopu = tong[i];
				 }
		}
		System.out.print(count1);
		System.out.print(" ");
		System.out.print(maxpopu);




		return EXIT_SUCCESS;
	}

}

