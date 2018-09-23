public class st
	{
		public int I;
	public int c;
	public int m;
	}

package <missing>;

public class GlobalMembers
{
		public static st[] st = tangible.Arrays.initializeWithDefaultstInstances(100000);

		public static int Main()
		{


			int n;
			int i;
			int j;
			int k = 0;
			int a;
			int b;

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
					st[i].I = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					st[i].c = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					st[i].m = Integer.parseInt(tempVar4);
				}

			}
			for (i = 0;i < 3;i++)
			{
				for (j = 0;j < n;j++)

				{
					if (k < st[j].c + st[j].m)
					{
						k = st[j].c + st[j].m;
						a = st[j].I;
						b = j;



					}
				}


				st[b].c = 0;
				st[b].m = 0;

				System.out.printf("%d %d",a,k);
				if (i < 2)
				{
					System.out.print("\n");
				}
				k = 0;





			}


		}


}

