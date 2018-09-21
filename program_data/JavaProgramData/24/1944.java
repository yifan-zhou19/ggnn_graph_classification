package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//char z[200];
		String z = new String(new char[200000]);
		int i;
		int k;
		int j;
		int min;
		int max;
		int d;
		int b;
		int a;
		int[] sz = new int[200];
		int num;
		int x;
		int y;
		int h = 0;
		int[] sx = new int[200];
		x = -1;
		z = new Scanner(System.in).nextLine();
		a = z.length();
		for (i = 0;i <= a - 1;i++)
		{
			if ((i == 0) && ((z.charAt(i) == ' ') || (z.charAt(i) == ',')))
			{
				continue;
			}

			if ((((i == 0) && (z.charAt(i) != ' ') && (z.charAt(i) != ',')) || ((i != 0) && ((z.charAt(i - 1) == ' ') || (z.charAt(i - 1) == ',')))) && (z.charAt(i) != ',') && (z.charAt(i) != ' '))
			{
				x++;
				sz[x] = 1; //????
				sx[x] = i; //?????????
				for (j = i + 1;j <= a - 1;j++)
				{
					if ((z.charAt(j) == ' ') || (z.charAt(j) == ','))
					{
						break;
					}
					if ((z.charAt(j) != ' ') && (z.charAt(j) != ','))
					{
						sz[x]++;


					}
				}

			}
		}


		max = 0;
		min = 1000;
		int maxindex;
		int minindex;
		for (i = 0;i <= x;i++)
		{
			if (max < sz[i])
			{
				max = sz[i];
				maxindex = i;

			}
			if (min > sz[i])
			{
				min = sz[i];
				minindex = i;
			}
		}
		d = maxindex;
		b = minindex;
	//	for(i=0;i<=x;i++){
	//		if(sz[i]==max){
	//			d=i;
	//			break;
	//		}

	//	}

	//	for(i=0;i<=x;i++){
	//		if(sz[i]==min){
	//			b=i;
	//			break;
	//		}
	//	}

		for (i = sx[d];i <= sx[d] + sz[d] - 1;i++)
		{
			System.out.printf("%c",z.charAt(i));

		}
		System.out.print("\n");
		for (i = sx[b];i <= sx[b] + sz[b] - 1;i++)
		{
			System.out.printf("%c",z.charAt(i));
		}

		System.out.print("\n");

		return 0;
	}

}
