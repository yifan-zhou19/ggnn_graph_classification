package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		int i;
		i = 0;
		while (true)
		{
				b = tangible.StringFunctions.changeCharacter(b, i, System.in.read());
				if (b.charAt(i) != ',')
				{
					break;
				}
				i++;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
		}
		if (i == 0)
		{
			System.out.print("No");
		}
		else
		{


			int num = i + 1;
			int max1;
			int max2;
			max1 = a[0];
			for (i = 1;i < num;i++)
			{
				if (max1 < a[i])
				{
					max1 = a[i];
				}
			}


			max2 = a[0];
			if (max2 == max1)
			{
				max2 = 0;
			}
			 for (i = 1;i < num;i++)
			 {
				if (max2 < a[i] && a[i] < max1)
				{
					max2 = a[i];
				}
			 }
			if (max2 == 0)
			{
				System.out.print("No\n");
			}
			else
			{
				System.out.printf("%u\n",max2);
			}
		}

		System.in.read();
		System.in.read();
		System.in.read();
	}


}

