/**
 *file:1000012776_4.cpp
 *author:???
 *date?2010-12-18
 *discription?????12-15??��??2?n???
 */

void ride2(char *); //???????2?
void antitone(char *); //?????????

void ride2(char * p)
{
	int i;
	int temp = 0;
	int num;
	for (i = 0 ; ; i++)
	{
		if (*(p + i) == '\0')
		{
			if (temp != 0)
			{
				*(p + i) = temp + '0';
			}
			break;
		}
		num = (*(p + i) - '0') * 2 + temp;
		* (p + i) = num % 10 + '0';
		temp = num / 10;
	}
}

void antitone(char * p)
{
	int i = 0;
	int j = 0;
	String q = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
	while (*(p + (i++)) != '\0')
	{
		;
	}
	i--;
	while (i >= 0)
	{
		i--;
		*(q.Substring(j)) = *(p + i);
		j++;
	}
	i = 0;
	while (*(p + i) != '\0')
	{
		*(p + i) = *(q.Substring(i));
		i++;
	}
}

int main()
{
	final String num = "1";
	int i;
	int power;
	power = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0 ; i < power ; i++)
	{
		ride2(num);
	}
	antitone(num);
	System.out.print(num);
	System.out.print("\n");
	return 0;
}

