package <missing>;

public class GlobalMembers
{
	/*??(15.2)????*/ 



	public static char boy;

	public static int queue(int num) //????num???????num?????girl???
	{
		char input;
		input = System.in.read();
		if (input == boy)
		{
			int girl;
			girl = queue(num + 1);
			System.out.printf("%d %d\n",num,girl);
			return queue(girl + 1);
		}
		else
		{
			return num;
		}
	}

	public static int Main()
	{
		boy = System.in.read();
		System.out.printf("0 %d\n",queue(1));
		return 0;
	}
}
