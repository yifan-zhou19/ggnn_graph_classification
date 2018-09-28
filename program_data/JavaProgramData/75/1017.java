package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] lai = new int[1001];
	int[] zou = new int[1001];
	int[] tongji = new int[1001];
	int count = 1;
	int renshu = 0;
	char meiyong = 0;
	int[] shijianbiao = new int[1001];
	lai[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (meiyong = System.in.read() == ',')
	{
	count++;
	lai[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	renshu = count;
	count = 1;
	zou[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (meiyong = System.in.read() == ',')
	{
	count++;
	zou[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	int i = 0; //????????
	for (count = 1;count <= renshu;count++)
	{
	for (i = lai[count];i < zou[count];i++)
	{
		shijianbiao[i]++;
	}
	}
	int max = shijianbiao[0];
	for (count = 1;count <= 1000;count++)
	{
	if (shijianbiao[count] > max)
	{
		max = shijianbiao[count];
	}
	}
	System.out.print(renshu);
	System.out.print(" ");
	System.out.print(max);
	System.out.print("\n");
	return 0;

	}
}

