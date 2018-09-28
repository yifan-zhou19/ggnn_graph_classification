package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char a;
		int flag = 0;
		int len = 0;
		do
		{
			a = System.in.read();
			if ((a == ' ' || a == '\n') && len != 0)
			{
				if (flag++ != 0)
				{
					System.out.printf(",%d",len);
				len = 0;
				}
				else
				{
					System.out.printf("%d",len);
					len = 0;
				}
			}
			else if (a != ' ' && a != '\n')
			{
				len++;
			}
		}while (a != '\n');
		return 0;
	}
}
