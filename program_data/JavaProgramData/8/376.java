package <missing>;

public class GlobalMembers
{
	public static int paixu(int[] shuzu, int num)
	{
		int i;
		int j;
		int jiaohuan;
		for (i = 1;i < num;i++)
		{
						  for (j = 0;j < num - i;j++)
						  {
								if (shuzu[j] > shuzu[j + 1])
								{
													   jiaohuan = shuzu[j];
													   shuzu[j] = shuzu[j + 1];
													   shuzu[j + 1] = jiaohuan;
								}
						  }
		}
	} //???????????
	public static int hebing(int[] shuzu1, int num1, int[] shuzu2, int num2)
	{
		int i;
		for (i = 0;i < num2;i++)
		{
			shuzu1[i + num1] = shuzu2[i];
		}
	} //????1???2
	public static int Main()
	{
		int[] shuzu1 = new int[200];
		int[] shuzu2 = new int[100];
		int num1;
		int num2;
		int i;
		int j;
		num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < num1;i++)
		{
			shuzu1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < num2;i++)
		{
			shuzu2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		paixu(shuzu1, num1); //???????1??
		paixu(shuzu2, num2); //???????2??
		hebing(shuzu1, num1, shuzu2, num2); //????????1???2
		for (i = 0;i < (num1 + num2);i++)
		{
								  System.out.print(shuzu1[i]);
								  if (i < (num1 + num2 - 1))
								  {
									  System.out.print(" ");
								  }
		} //????????
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;

	}
}

