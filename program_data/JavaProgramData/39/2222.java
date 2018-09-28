package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int total = 0;
		int max_n = new int(int amount[], int n);
		int max_num;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct data
	//	{
	//		   char name[21];
	//		   int grade;
	//		   int assessment;
	//		   char leader;
	//		   char west;
	//		   int paper;
	//	};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		data[] input = tangible.Arrays.initializeWithDefaultdataInstances(n);
		int[] amount = new int[n];



		for (i = 0; i <= n - 1; i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  input[i].name = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  input[i].grade = tempVar3;
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  input[i].assessment = tempVar4;
			  }
			  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar5 != null)
			  {
				  input[i].leader = tempVar5;
			  }
			  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar6 != null)
			  {
				  input[i].west = tempVar6;
			  }
			  String tempVar7 = ConsoleInput.scanfRead(" ");
			  if (tempVar7 != null)
			  {
				  input[i].paper = tempVar7;
			  }
			  amount[i] = 8000 * (input[i].grade > 80 && input[i].paper > 0) + 4000 * (input[i].grade > 85 && input[i].assessment > 80) + 2000 * (input[i].grade > 90) + 1000 * (input[i].grade > 85 && input[i].west == 'Y') + 850 * (input[i].assessment > 80 && input[i].leader == 'Y');
			  total = total + amount[i];
		}

		max_num = max_n(amount, n);
		System.out.printf("%s\n%d\n%d", input[max_num].name, amount[max_num], total);

		input = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(amount);


		return 0;
	}

	public static int max_n(int[] amount, int n)
	{
		int max_num;
		int max = 0;
		int i;

		for (i = 0; i <= n - 1; i++)
		{
			  if (amount[i] > max)
			  {
						  max = amount[i];
						  max_num = i;
			  }
		}


		return max_num;
	}


}

