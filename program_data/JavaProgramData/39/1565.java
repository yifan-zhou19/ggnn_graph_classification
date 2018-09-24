public class student
	{
		public String name = new String(new char[25]);
		public int q;
		public int b;
		public int l;
		public int money;
		public char w;
		public char x;
	}

package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100);
			int n;
			int i;
			int sum = 0;
			int max = 0;
			int max_i = 0;
			int[] m = new int[100];

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
					a[i].name = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					a[i].q = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i].b = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar5 != null)
				{
					a[i].w = tempVar5.charAt(0);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar6 != null)
				{
					a[i].x = tempVar6.charAt(0);
				}
				String tempVar7 = ConsoleInput.scanfRead(" ");
				if (tempVar7 != null)
				{
					a[i].l = Integer.parseInt(tempVar7);
				}
				if ((a[i].q > 80) && (a[i].l >= 1))
				{
					m[i] += 8000;
				}
				if ((a[i].b > 80) && (a[i].q > 85))
				{
					m[i] += 4000;
				}
				if (a[i].q > 90)
				{
					m[i] += 2000;
				}
				if ((a[i].q > 85) && (a[i].x == 'Y'))
				{
					m[i] += 1000;
				}
				if ((a[i].b > 80) && (a[i].w == 'Y'))
				{
					m[i] += 850;
				}
				a[i].money = m[i];

			}






			m[0] = max = a[0].money;
			max_i = 0;
			for (i = 0;i < n;i++)
			{
				sum += m[i];
				if (a[i].money > max)
				{
					max = a[i].money;
					max_i = i;
				}

			}


			System.out.printf("%s\n",a[max_i].name);
			System.out.printf("%d\n",m[max_i]);
			System.out.printf("%d\n",sum);




		return 0;



		}
}

