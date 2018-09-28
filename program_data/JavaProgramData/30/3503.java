package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zuidashu;
		float shang;
		int pingfanghe = 0;

		zuidashu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= zuidashu; i++)
		{
			if (i % 7 == 0)
			{
				pingfanghe = pingfanghe + i * i;
				continue;
			}
			for (int j = 10; j < i * 10; j = j * 10)
			{
				if (i % j - i % (j / 10) == 7 * j / 10)
				{
					pingfanghe = pingfanghe + i * i;

					break;
				}
			}
		}


		pingfanghe = (-1) * pingfanghe;
		for (int i = 1; i <= zuidashu; i++)
		{
			pingfanghe = pingfanghe + i * i;
		}

		System.out.print(pingfanghe);
		return 0;
	}


}

