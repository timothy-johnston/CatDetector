# Generated by Django 2.1.4 on 2018-12-08 19:20

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('restAPI', '0002_auto_20181206_2129'),
    ]

    operations = [
        migrations.CreateModel(
            name='Images',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('image', models.ImageField(upload_to='', verbose_name='Uploaded image')),
            ],
        ),
    ]