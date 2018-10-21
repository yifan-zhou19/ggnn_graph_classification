package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] sum = new int[100001];
		int temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int ID;
	//		int chinese;
	//		int math;
	//	}
		person[100001]; //???????,??ID?????????
		for (i = 1;i <= n;i++)
		{
			person[i].ID = ConsoleInput.readToWhiteSpace(true);
			person[i].chinese = ConsoleInput.readToWhiteSpace(true);
			person[i].math = ConsoleInput.readToWhiteSpace(true);
			sum[i] = person[i].chinese + person[i].math; //????
		}
		for (i = 1;i <= n;i++)
		{
			if (sum[i] > temp)
			{
				temp = sum[i];
				j = i; //?????
			}
		}
		temp = 0;
		for (i = 1;i <= n;i++)
		{
			if (sum[i] > temp && i != j) //???
			{
				temp = sum[i];
				k = i;
			}
		}
	temp = 0;
		for (i = 1;i <= n;i++)
		{
			if (sum[i] > temp && i != j && i != k) //???
			{
				temp = sum[i];
				l = i;
			}
		}
		System.out.print(person[j].ID);
		System.out.print(" ");
		System.out.print(sum[j]);
		System.out.print("\n");
		System.out.print(person[k].ID);
		System.out.print(" ");
		System.out.print(sum[k]);
		System.out.print("\n");
		System.out.print(person[l].ID);
		System.out.print(" ");
		System.out.print(sum[l]);
		System.out.print("\n");
		return 0;
	}
}

