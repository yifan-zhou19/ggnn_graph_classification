package <missing>;

public class GlobalMembers
{
	/*;
	 * src.c
	 *
	 *  Created on: 2009-11-9
	 *      Author: JacksonTB
	 */

	public static float calc_gpa(int a)
	{
			switch (a)
			{
			case 100:
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
			case 90:
			{
				return 4.0F;
			}
			case 89:
			case 88:
			case 87:
			case 86:
			case 85:
				return 3.7F;
			case 84:
			case 83:
			case 82:
				return 3.3F;
			case 81:
			case 80:
			case 79:
			case 78:
				return 3F;
			case 77:
			case 76:
			case 75:
				return 2.7F;
			case 74:
			case 73:
			case 72:
				return 2.3F;
			case 71:
			case 70:
			case 69:
			case 68:
				return 2F;
			case 67:
			case 66:
			case 65:
			case 64:
				return 1.5F;
			case 63:
			case 62:
			case 61:
			case 60:
				return 1F;
			default:
				return 0F;

			}
	}
	public static int Main()
	{
		int[] gpa_all = new int[10];
		int[] score = new int[10];
		int gpa_sum = 0;
		float[] gpa0 = new float[10];
		float gpa = 0F;

		int n;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				gpa_all[i] = Integer.parseInt(tempVar2);
			}
			gpa_sum += gpa_all[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			gpa += gpa_all[i] * calc_gpa(score[i]);
		}
		gpa /= (float)gpa_sum;
		System.out.printf("%.2f", gpa);
	}

}

