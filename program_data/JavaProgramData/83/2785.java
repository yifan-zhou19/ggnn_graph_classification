package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		double zxf = 0;
		double xfj = 0;
		double gpa;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct lesson
	//	{
	//		int point;
	//		int score;
	//		double jd;
	//	}
	//	sub[10];
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
				sub[i].point = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sub[i].score = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			switch (sub[i].score)
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
				sub[i].jd = 4.0;
				break;
			case 89:
			case 88:
			case 87:
			case 86:
			case 85:
				sub[i].jd = 3.7;
				break;
			case 84:
			case 83:
			case 82:
				sub[i].jd = 3.3;
				break;
			case 81:
			case 80:
			case 79:
			case 78:
				sub[i].jd = 3.0;
				break;
			case 77:
			case 76:
			case 75:
				sub[i].jd = 2.7;
				break;
			case 74:
			case 73:
			case 72:
				sub[i].jd = 2.3;
				break;
			case 71:
			case 70:
			case 69:
			case 68:
				sub[i].jd = 2.0;
				break;
			case 67:
			case 66:
			case 65:
			case 64:
				sub[i].jd = 1.5;
				break;
			case 63:
			case 62:
			case 61:
			case 60:
				sub[i].jd = 1.0;
				break;
			default:
				sub[i].jd = 0;
				break;

			}
		}
		for (i = 0;i < n;i++)
		{
			xfj += sub[i].point * sub[i].jd;
			zxf += sub[i].point;
		}
		gpa = xfj / zxf;
		System.out.printf("%.2lf\n",gpa);
	}

}

