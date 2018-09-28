package <missing>;

public class GlobalMembers
{
	//**************************
	//??????? 
	//??????1200012914 
	//???2012.12.11
	//**************************


	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct count
	//	{
	//		int knowshim; //????????
	//		int heknows; //????????
	//	}
	//	person[10000];
		int num; //???
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0; i < num; i++)
		{
			person[i].knowshim = 0;
			person[i].heknows = 0;
		} //?person???????????0
		int who; //who????whom??????
		int whom;
		int flag = 0;
		while (true)
		{
			who = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			whom = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (who + whom == 0)
			{
				break; //???0 0?????
			}
			person[who].heknows++;
			person[whom].knowshim++;
		}
		for (i = 0; i < num; i++)
		{
			 //??????????0????????num-1?????? 
			 if (person[i].heknows == 0 && person[i].knowshim == num - 1)
			 {
				 flag = 1;
				 System.out.print(i);
				 System.out.print("\n");
			 }
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}

		return 0;
	}

}

