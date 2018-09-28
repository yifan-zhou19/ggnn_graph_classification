package <missing>;

public class GlobalMembers
{
	public static float derta(float x,float y,float z)
	{
		return (y * y - 4 * x * z);
	}

	public static void Main()
	{
		float a;
		float b;
		float c;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Float.parseFloat(tempVar4);
			}
			if (a != 0F)
			{
				if (derta(a, b, c) == 0F)
				{
					System.out.printf("x1=x2=%.5f\n",-b / (2 * a));
				}
				else if (derta(a, b, c) > 0F)
				{
					System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt(derta(a, b, c))) / (2 * a),(-b - Math.sqrt(derta(a, b, c))) / (2 * a));
				}
				else
				{
					if (-b / (2 * a) == 0)
					{
						System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",Math.abs(-b / (2 * a)),Math.sqrt(-derta(a, b, c)) / (2 * a),Math.abs(-b / (2 * a)),Math.sqrt(-derta(a, b, c)) / (2 * a));
					}
					else
					{
						System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),Math.sqrt(-derta(a, b, c)) / (2 * a),-b / (2 * a),Math.sqrt(-derta(a, b, c)) / (2 * a));
					}
				}
			}
			else
			{
				System.out.print("ERROR\n");
			}
		}
	}


}

