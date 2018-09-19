package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int output = 0;
		int i;
		int j;
		int length;
		float[] data = new float[16];

		data[0] = -2F;

		while (data[0] != -1F)
		{
					  for (i = 0; i <= 15; i++)
					  {
							String tempVar = ConsoleInput.scanfRead();
							if (tempVar != null)
							{
								data[i] = Float.parseFloat(tempVar);
							}
							if (data[i] == 0F)
							{
									   length = i;
									   break;
							}
							if (data[i] == -1F)
							{
									   break;
							}
					  }

					  if (data[i] == -1F)
					  {
								 break;
					  }

					  for (i = 0; i <= length - 1; i++)
					  {
							for (j = 0; j <= length - 1; j++)
							{
								  if ((data[j] / data[i]) == 2)
								  {
										  output = output + 1;
								  }
							}
					  }

					  System.out.printf("%d\n", output);
					  output = 0;

		}


		return 0;
	}



}

