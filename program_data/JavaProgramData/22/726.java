package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m1 = 0;
	int m2 = 0;
	int i = 1;
	int mtemp;
	char ch;

	do
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			mtemp = Integer.parseInt(tempVar);
		}
		if (mtemp > m1)
		{
			m2 = m1;
		m1 = mtemp;
		}
		else if (mtemp > m2 && mtemp < m1)
		{
			m2 = mtemp;
		}

		ch = System.in.read();
		i = i++;

	}while (ch == ',');

	if (m1 == m2 || m2 == 0 || i == 2)
	{
		System.out.print("No");
	}
	else
	{
	System.out.printf("%d",m2);
	}

	return 0;

	}
}

