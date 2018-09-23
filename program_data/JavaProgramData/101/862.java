package <missing>;

public class GlobalMembers
{
	//***************************************************************************
	//??????
	//????????????????
	//??????
	//***************************************************************************
	public static int Main()
	{
												   //??A,B,C?????????????m
		int a;
		int b;
		int c;
		int appetiteA;
		int appetiteB;
		int appetiteC;
		int[] l = new int[3];
		int m;
		char[] people = {'A', 'B', 'C'};
		char p;
		for (appetiteA = 0; appetiteA <= 2; appetiteA++)
		{
			for (appetiteB = 0; appetiteB <= 2; appetiteB++)
			{
				for (appetiteC = 0; appetiteC <= 2; appetiteC++)
				{
					a = (appetiteB > appetiteA) + (appetiteC == appetiteA);
					b = (appetiteA > appetiteB) + (appetiteA > appetiteC);
					c = (appetiteC > appetiteB) + (appetiteB > appetiteA);
					if (a != b && a != c && b != c)
					{
						l[0] = a;
						l[1] = b;
						l[2] = c;
					}
				}
			}
		}
		for (int i = 0;i < 2; i++)
		{
			if (l[i] < l[i + 1])
			{
				m = l[i];
				p = people[i];
				l[i] = l[i + 1];
				people[i] = people[i + 1];
				l[i + 1] = m;
				people[i + 1] = p;
			}
		}
		System.out.print(people[0]);
		System.out.print(people[1]);
		System.out.print(people[2]);
		System.out.print("\n");
		return 0;
	}


}
