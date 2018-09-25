package <missing>;

public class GlobalMembers
{
	//????????????
	//??????
	//?????2010-12-24
	//????????????????????????


	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		   int score,num;
	//		   } //???????????
	//	a[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i].num = ConsoleInput.readToWhiteSpace(true);
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i].score = x + y;
		}
		a[0] = a[1];
		for (i = 1;i <= 3;i++) //??
		{
		  for (j = i + 1;j <= n;j++)
		  {
			if (a[i].score < a[j].score)
			{
			a[0] = a[i];
			a[i] = a[j];
			a[j] = a[0];
			}
		  }
		}
		System.out.print(a[1].num);
		System.out.print(" ");
		System.out.print(a[1].score);
		System.out.print("\n");
		System.out.print(a[2].num);
		System.out.print(" ");
		System.out.print(a[2].score);
		System.out.print("\n");
		System.out.print(a[3].num);
		System.out.print(" ");
		System.out.print(a[3].score);
	}

}

